package com.example.fbi.model

data class MostWantedResponse(
        val total: Int,
        val items: List<FbiWantedItem>
)

data class FbiWantedItem(
        val uid: String?,
        val title: String?,
        val description: String?,
        val caution: String?,
        val warning_message: String?,
        val reward_text: String?,
        val reward_min: Int?,
        val reward_max: Int?,
        val race: String?,
        val race_raw: String?,
        val sex: String?,
        val nationality: String?,
        val place_of_birth: String?,
        val eyes: String?,
        val eyes_raw: String?,
        val hair: String?,
        val hair_raw: String?,
        val height_min: Int?,
        val height_max: Int?,
        val weight_min: Int?,
        val weight_max: Int?,
        val weight: String?,
        val scars_and_marks: String?,
        val remarks: String?,
        val occupations: List<String>?,
        val aliases: List<String>?,
        val dates_of_birth_used: List<String>?,
        val subjects: List<String>?,
        val status: String?,
        val publication: String?,
        val modified: String?,
        val url: String?,
        val path: String?,
        val pathId: String?,
        val poster_classification: String?,
        val person_classification: String?,
        val field_offices: List<String>?,
        val additional_information: String?,
        val build: String?,
        val complexion: String?,
        val languages: List<String>?,
        val coordinates: List<Any>?,
        val locations: List<Any>?,
        val legat_names: List<String>?,
        val suspects: List<Any>?,
        val age_min: Int?,
        val age_max: Int?,
        val age_range: String?,
        val details: String?,
        val files: List<FbiFile>?,
        val images: List<FbiImage>?,
        val possible_states: List<String>?,
        val possible_countries: List<String>?
)

data class FbiImage(
        val caption: String?,
        val thumb: String?,
        val original: String?,
        val large: String?
)

data class FbiFile(
        val url: String?,
        val name: String?
)
