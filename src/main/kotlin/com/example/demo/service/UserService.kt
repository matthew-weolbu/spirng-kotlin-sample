package com.example.demo.service

import com.example.demo.entity.User
import org.springframework.stereotype.Service
import com.example.demo.repository.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {
  fun findAllUsers(): List<User> = userRepository.findAll()

  fun findUserById(id: Long): User? = userRepository.findById(id).orElse(null)

  fun createUser(user: User): User = userRepository.save(user)

  fun updateUser(id: Long, userDetails: User): User? {
    val user = userRepository.findById(id).orElse(null)
    user?.let {
      it.name = userDetails.name
      it.email = userDetails.email
      return userRepository.save(it)
    }
    return null
  }

  fun deleteUserById(id: Long) {
    userRepository.deleteById(id)
  }

}