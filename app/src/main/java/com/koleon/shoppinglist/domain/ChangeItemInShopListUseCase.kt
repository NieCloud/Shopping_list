package com.koleon.shoppinglist.domain

class ChangeItemInShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun changeItemInShopList(item: ShopItem) {
        shopListRepository.changeItemInShopList(item)
    }
}