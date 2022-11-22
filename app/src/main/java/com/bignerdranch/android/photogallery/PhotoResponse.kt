package com.bignerdranch.android.photogallery

import com.bignerdranch.android.photogallery.data.GalleryItem
import com.google.gson.annotations.SerializedName

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems:
            List<GalleryItem>


}