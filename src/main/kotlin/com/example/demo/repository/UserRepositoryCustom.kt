package com.example.demo.repository

import com.example.demo.entity.User

interface UserRepositoryCustom {
  fun findByName(name: String): List<User>
}
