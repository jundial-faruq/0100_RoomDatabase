package com.example.pertemuan9.room;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tblSiswa")
public class Siswa {
    @PrimaryKey(autoGenerate = true)
    val id : int = 0,
    val nama : String,
    val alamat : String,
    val telepon : String
}
