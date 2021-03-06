package com.pluralsight.courses.Scala_Fundamentals.project.entities


object Email {
  def apply(value: String, domain: String): Email = new Email(value, domain)
}

class Email(val value: String, val domain: String) {
  override def toString: String = s"$value@$domain"
}
