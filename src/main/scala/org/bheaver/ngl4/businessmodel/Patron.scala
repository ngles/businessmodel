package org.bheaver.ngl4.businessmodel

import java.time.{LocalDateTime, LocalDate}

final case class Patron(patronId: String, createdOn: Option[LocalDateTime], departmentId: Int, firstName: String, middleName: String,
                        lastName: String, addresses: List[Address], contact: List[Contact], entryDate: LocalDateTime,
                        courseId: Int, status: Char, custom: String, socialNetwork: SocialNetwork,
                        patronAuthentication: PatronAuthentication)

final case class Address(address1: String, address2: String, city: String, state: String, zipCode: String, country: String,
                         isPrimary: Boolean)

final case class SocialNetwork(twitterId: String, facebookId: String)

final case class Contact(phone1: String, phone2: String, email: String, secondaryEmail: String, fax: String, isPrimary: Boolean,
                         commEmail: Char, commText: Char, commPrint: Char)

final case class PatronAuthentication(patronCategoryId: Int, patronType: String, membershipStartDate: LocalDate,
                                      membershipExpiryDate: LocalDate, userPassword: String, privilege: String,
                                      loginId: String, authenticateLocaldatabase: String, subLocationId: Int)