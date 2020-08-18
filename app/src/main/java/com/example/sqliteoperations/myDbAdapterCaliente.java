package com.example.sqliteoperations;

import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;


public class myDbAdapterCaliente {
    myDbHelper myhelper;
    public myDbAdapterCaliente(Context context)
    {
        myhelper = new myDbHelper(context);
    }

    public long insertData(String textOneCal, String sipsCal)
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.TEXTONECAL, textOneCal);
        contentValues.put(myDbHelper.SIPSCAL, sipsCal);
        long id = dbb.insert(myDbHelper.TABLE_NAME, null , contentValues);
        return id;
    }

    public String getData()
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] columns = {myDbHelper.UID,myDbHelper.TEXTONECAL,myDbHelper.SIPSCAL};
        Cursor cursor =db.query(myDbHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(myDbHelper.UID));
            String textOneCal =cursor.getString(cursor.getColumnIndex(myDbHelper.TEXTONECAL));
            String  sipsCal =cursor.getString(cursor.getColumnIndex(myDbHelper.SIPSCAL));
            buffer.append(cid+ "   " + textOneCal + "   " + sipsCal +" \n");
        }
        return buffer.toString();
    }

    public  int delete(String uname)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] whereArgs ={uname};

        int count =db.delete(myDbHelper.TABLE_NAME ,myDbHelper.TEXTONECAL+" = ?",whereArgs);
        return  count;
    }

    public int updateOneCal(String oldName , String newName)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.TEXTONECAL,newName);
        String[] whereArgs= {oldName};
        int count =db.update(myDbHelper.TABLE_NAME,contentValues, myDbHelper.TEXTONECAL+" = ?",whereArgs );
        return count;
    }

    static class myDbHelper extends SQLiteOpenHelper
    {
        private static final String DATABASE_NAME = "myDatabase";    // Database Name
        private static final String TABLE_NAME  = "Caliente";   // Table Name
        private static final int DATABASE_Version = 1;    // Database Version
        private static final String UID="_idCaliente";     // Column I (Primary Key)
        private static final String TEXTONECAL = "textOneCal";    //Column II
        private static final String SIPSCAL= "sipsCal";    // Column III
        private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
                " ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+ TEXTONECAL +" VARCHAR(255) ,"+ SIPSCAL +" VARCHAR(2));";
        private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+TABLE_NAME;
        private Context context;


        public myDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.context=context;
        }

        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE);
            } catch (Exception e) {
                Message.message(context,""+e);
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Message.message(context,"OnUpgrade");
                db.execSQL(DROP_TABLE);
                onCreate(db);
            }catch (Exception e) {
                Message.message(context,""+e);
            }
        }


    }

    public void createDataBase(){
        SQLiteDatabase mydatabase = openOrCreateDatabase("myDatabase", null ,null);
    }
}