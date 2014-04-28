package com.zoo.hbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
/**
 * 
 * @author yankai913@gmail.com
 * @date 2014-4-28
 */
public class SimpleClient {

    static HBaseAdmin hBaseAdmin;
    static Configuration conf;
    static {
        conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "love-kaige");
        try {
            hBaseAdmin = new HBaseAdmin(conf);
        }
        catch (MasterNotRunningException e) {
            e.printStackTrace();
        }
        catch (ZooKeeperConnectionException e) {
            e.printStackTrace();
        }
    }


    public static void createTable(String tableName, String[] columns) throws Exception {
        if (hBaseAdmin.tableExists(tableName)) {
            throw new IllegalStateException("table " + tableName + " already exists!");
        }
        HTableDescriptor hTableDescriptor = new HTableDescriptor(tableName);
        for (String columnName : columns) {
            HColumnDescriptor column = new HColumnDescriptor(columnName);
            hTableDescriptor.addFamily(column);
        }
        hBaseAdmin.createTable(hTableDescriptor);
        byte[] tablename = hTableDescriptor.getName();
        HTableDescriptor[] tables = hBaseAdmin.listTables();
        if (tables.length != 1 && Bytes.equals(tablename, tables[0].getName())) {
            throw new IOException("failed create of table");
        }
        System.out.println("create table successed");
    }


    public static void dropTable(String tableName) throws Exception {
        if (hBaseAdmin.tableExists(tableName)) {
            hBaseAdmin.disableTable(tableName);
            hBaseAdmin.deleteTable(tableName);
        }
        System.out.println("drop table successed");
    }


    public static HTable getHTable(String tableName) throws Exception {
        return new HTable(conf, tableName);
    }


    public static void insert(String tableName, Map<String, String> map) throws Exception {
        HTable hTable = getHTable(tableName);
        byte[] row1 = Bytes.toBytes("row1");
        Put p1 = new Put(row1);
        for (String columnName : map.keySet()) {
            byte[] value = Bytes.toBytes(map.get(columnName));
            String[] str = columnName.split(":");
            byte[] family = Bytes.toBytes(str[0]);
            byte[] qualifier = null;
            if (str.length > 1) {
                qualifier = Bytes.toBytes(str[1]);
            }
            p1.add(family, qualifier, value);
        }
        hTable.put(p1);
        Get g1 = new Get(row1);
        Result result = hTable.get(g1);
        System.out.println("Get: " + result);
        System.out.println("insert successed");
    }


    public static void delete(String tableName, String rowKey) throws Exception {
        HTable hTable = getHTable(tableName);
        List<Delete> list = new ArrayList<Delete>();
        Delete d1 = new Delete(Bytes.toBytes(rowKey));
        list.add(d1);
        hTable.delete(list);
        Get g1 = new Get(Bytes.toBytes(rowKey));
        Result result = hTable.get(g1);
        System.out.println("Get: " + result);
        System.out.println("delete successed");
    }


    public static void update() {

    }


    public static void select() {

    }


    public static void main(String[] args) throws Exception {
        // dropTable("ttt");
        String tableName = "ttt";
        String[] columns = new String[] { "column_A", "column_B" };
      //  createTable(tableName, columns);
        Map<String, String> map = new HashMap<String, String>();
        map.put("column_A", "AAA");
        map.put("column_B:1", "b1");
        map.put("column_B:2", "b2");
       // insert("ttt", map);
//        delete(tableName, rowKey);
    }


}
