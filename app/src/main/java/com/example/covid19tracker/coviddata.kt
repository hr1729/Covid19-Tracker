package com.example.covid19tracker

import com.google.gson.annotations.SerializedName

data class StatewiseItem(

	@field:SerializedName("statenotes")
	val statenotes: String? = null,

	@field:SerializedName("recovered")
	val recovered: String? = null,

	@field:SerializedName("deltadeaths")
	val deltadeaths: String? = null,

	@field:SerializedName("migratedother")
	val migratedother: String? = null,

	@field:SerializedName("deltarecovered")
	val deltarecovered: String? = null,

	@field:SerializedName("active")
	val active: String? = null,

	@field:SerializedName("deltaconfirmed")
	val deltaconfirmed: String? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("statecode")
	val statecode: String? = null,

	@field:SerializedName("confirmed")
	val confirmed: String? = null,

	@field:SerializedName("deaths")
	val deaths: String? = null,

	@field:SerializedName("lastupdatedtime")
	val lastupdatedtime: String? = null
)

data class Coviddata(

	@field:SerializedName("statewise")
	val statewise: List<StatewiseItem>
)
