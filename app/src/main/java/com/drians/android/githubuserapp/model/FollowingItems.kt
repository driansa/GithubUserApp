package com.drians.android.githubuserapp.model


data class FollowingItems(
    var id: Int = 0,
    var login: String? = null,
    var avatar_url: String? = null,
    var type: String? = null
)