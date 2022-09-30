package com.example.managefinance.helpers

import android.database.Cursor
import com.example.managefinance.db_notes.DatabaseContractN
import com.example.managefinance.entity.Notes

object MappingHelperNote {

    fun mapCursorToArrayList(transCursor: Cursor?): ArrayList<Notes> {
        val transList = ArrayList<Notes>()
        transCursor?.apply {
            while (moveToNext() ) {

                val id = getInt(getColumnIndexOrThrow(DatabaseContractN.NoteColumns._ID))
                val date = getString(getColumnIndexOrThrow(DatabaseContractN.NoteColumns.DATE))
                val judul = getString(getColumnIndexOrThrow(DatabaseContractN.NoteColumns.TITTLE))
                val content = getString(getColumnIndexOrThrow(DatabaseContractN.NoteColumns.CONTENT))

                transList.add(Notes(id, date, judul, content))
            }
        }

        return transList
    }

}