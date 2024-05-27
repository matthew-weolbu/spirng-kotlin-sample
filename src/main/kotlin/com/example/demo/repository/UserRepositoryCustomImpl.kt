package com.example.demo.repository

import com.example.demo.config.QuerydslRepositorySupport
import com.example.demo.entity.QUser
import com.example.demo.entity.User

class UserRepositoryCustomImpl : UserRepositoryCustom, QuerydslRepositorySupport(User::class.java) {
    override fun findByName(name: String): List<User> {
        return from(QUser.user)
            .where(QUser.user.name.eq(name))
            .fetch()
    }
}
