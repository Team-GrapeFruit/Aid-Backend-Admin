package com.grapefruit.aid.domain.store.presentation.dto.request

data class ModifyStoreReqDto(
    val storeName: String,
    val information: String,
    val storeImgUrl: String?
)