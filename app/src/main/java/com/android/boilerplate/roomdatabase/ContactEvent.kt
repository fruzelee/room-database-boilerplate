package com.android.boilerplate.roomdatabase

sealed interface ContactEvent {
    object SaveContact : ContactEvent
    data class SetFristName(val firstName: String) : ContactEvent
    data class SetSecondName(val secondName: String) : ContactEvent
    data class SetPhoneNumber(val phoneNumber: String) : ContactEvent
    object ShowDialog : ContactEvent
    object HideDialog : ContactEvent
    data class SortContacts(val sortType: SortType) : ContactEvent
    data class DeleteContact(val contact: Contact) : ContactEvent
}