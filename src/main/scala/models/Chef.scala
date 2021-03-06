package models

import models.Ingredients.{Carrot, ChickenLeg, Rice}

class Chef {
  val kitchen  = new Kitchen
  val supplier = new Supplier
  def cook(): Dish = {
    if (kitchen.carrotSeq.size < 0) supplier.supply[Carrot.type](10)
    if (kitchen.chickenSeq.size < 0) supplier.supply[ChickenLeg.type](2)
    if (kitchen.riceSeq.size < 0) supplier.supply[Rice.type](50)

    val carrot     = kitchen.carrotSeq.drop(5)
    val chickenLeg = kitchen.chickenSeq.drop(1)
    val rice       = kitchen.riceSeq.drop(20)
    Dish(carrot,chickenLeg,rice)

  }
}
