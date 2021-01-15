package com.example.tp5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.EditText;

public class DataBaseManager extends SQLiteOpenHelper {

    public static final String DATABASE_NAME= "users.db";
    public static final int DATABASE_VERSION=1;

    public DataBaseManager(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       String strSql= " create table User ( "
               + "id integer primary key autoincrement, "
               +  " name text not null, "
               +  " password text not null,"
              + ")";

       db.execSQL(strSql);

        Log.i("DATABASE", "onCreate invoked");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void record(EditText nom, EditText passeword){

        String strSql= "insert into User (name , password) values ( " +nom+ ","+ passeword+ " )";

        this.getWritableDatabase().execSQL(strSql);
        Log.i("DATABASE", "record  invoked");
    }
}
