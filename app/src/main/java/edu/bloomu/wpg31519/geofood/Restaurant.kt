package edu.bloomu.wpg31519.geofood

import kotlin.properties.Delegates

/**
 * Holder for the food values accessed through the google places api this class holds
 * values of a restaurant including the name, address, latitude, longitude,rating and
 * a next page token
 *
 * @author Will Gallagher
 */

//data class Restaurant(var name :String?= null,var address:String?=null,
//                      var rating:Float?=null,var photoLink:String?=null,
//                      var priceLevel:Int?,var key:String?=null)

class Restaurant{

private var name: String
private var address: String
private var rating: Float
private var photoLink : String
private var priceLevel : Int
private  var key:String

constructor(name:String,address:String,rating:Float,photoLink:String,priceLevel:Int){
    this.name = name
    this.address = address
    this.photoLink = photoLink
    this.priceLevel = priceLevel
    this.rating = rating
    this.key = ""


}constructor(name:String,address:String,rating:Float,photoLink:String,priceLevel:Int,key:String){
        this.name = name
        this.address = address
        this.photoLink = photoLink
        this.priceLevel = priceLevel
        this.rating = rating
        this.key = key

    }
    constructor(){
        this.name = ""
        this.key = ""
        this.address = ""
        this.photoLink = ""
        this.priceLevel = 0
        this.rating = 0.0f
    }



    /**
     * Returns the address of the restaurant
     */
    fun getAddress():String{
        return this.address
    }

    /**
     * gets the price level of the restaurant
     */
    fun getPriceLevel():Int{
        return priceLevel
    }

    /**
     * Returns the name of the restaurant
     */
    fun getName():String{
        return this.name
    }

    /**
     * gets the rating of the restaurant
     */
    fun getRating(): Float{
        return rating
    }

    /**
     * gets the photo reference
     */
    fun getLink():String{
        return photoLink
    }
    fun setLink(link:String){
        this.photoLink = link
    }
    fun setName(name:String){
        this.name = name
    }
    fun setAddress(address:String){
        this.address = address
    }
    fun setRating(rating: Float){
        this.rating = rating
    }
    fun setPriceLevel(priceLevel: Int){
        this.priceLevel = priceLevel
    }
    fun setKey(key: String){
        this.key = key
    }
}