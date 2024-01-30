package com.example.nykka_assignment.domain.model

interface DomainMapper<T, DomainModel> {
    fun mapToDomainModel(model: T): DomainModel

    fun mapFromDomainModel(domainModel: DomainModel): T
    fun fromDtoList(initial: List<T>): List<DomainModel>

    fun toDtoList(initial: List<DomainModel>): List<T>

}

