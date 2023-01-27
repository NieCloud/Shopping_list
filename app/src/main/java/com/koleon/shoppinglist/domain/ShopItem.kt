package com.koleon.shoppinglist.domain

data class ShopItem(
    val count: Int,
    val name: String,
    val enabled: Boolean,
    var id: Int = UNCLASSIFIED_ID,) {

    companion object {

        const val UNCLASSIFIED_ID = -1;
    }

}

