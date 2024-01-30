package com.example.nykka_assignment.network.model

import com.example.nykka_assignment.domain.model.Cat
import com.example.nykka_assignment.domain.model.DomainMapper


class CatDtoMapper : DomainMapper<CatDto, Cat> {

    override fun mapToDomainModel(model: CatDto): Cat {
        return Cat(
            id = model.id,
            url = model.url,
            width = model.width,
            height = model.height,

            )
    }

    override fun mapFromDomainModel(domainModel: Cat): CatDto {
        return CatDto(
            id = domainModel.id,
            url = domainModel.url,
            width = domainModel.width,
            height = domainModel.height
        )
    }

    override fun fromDtoList(initial: List<CatDto>): List<Cat> {
        return initial.map { it ->
            mapToDomainModel(it)
        }

    }

    override fun toDtoList(initial: List<Cat>): List<CatDto> {
        return initial.map { it -> mapFromDomainModel(it) }
    }


}
