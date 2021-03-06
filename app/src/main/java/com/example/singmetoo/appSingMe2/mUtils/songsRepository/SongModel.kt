package com.example.singmetoo.appSingMe2.mUtils.songsRepository

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.singmetoo.appSingMe2.mUtils.helpers.AppConstants

@Entity(tableName = AppConstants.TABLE_SONGS_FROM_DEVICE)
class SongModel (

    @PrimaryKey
    var songId: Long = 0,

    var songAlbumId: Long = 0,

    var songPath:String? = "",

    var songTitle:String? = "",

    var songAlbum:String? = "",

    var songArtist:String? = "",

    var songComposer:String? = "",

    var songSize:Long? = null,

    var songDateAdded:Long? = null,

    var songDateModified:Long? = null,

    var songDuration:Long? = null,

    var songCurrentlyPlaying:Boolean = false
)