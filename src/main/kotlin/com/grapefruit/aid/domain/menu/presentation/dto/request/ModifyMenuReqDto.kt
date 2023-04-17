package com.grapefruit.aid.domain.menu.presentation.dto.request

data class ModifyMenuReqDto(
    val menuName: String,
    val cost: Long,
    val description: String,
    val menuImgUrl: String?
)