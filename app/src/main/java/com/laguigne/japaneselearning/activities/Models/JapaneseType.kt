package com.laguigne.japaneselearning.activities.Models

import android.os.Parcel
import android.os.Parcelable

class JapaneseType (val id : String,
                    val title : String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<JapaneseType> {
        override fun createFromParcel(parcel: Parcel): JapaneseType {
            return JapaneseType(parcel)
        }

        override fun newArray(size: Int): Array<JapaneseType?> {
            return arrayOfNulls(size)
        }
    }


}
