data class Agent(val id: Int) {

    fun createProperty(propertyId: Int, street: String): Property {
        return Property(propertyId, street)
    }

    fun publishProperty(property: Property): Ad {
        return Ad(this.id, property.id)
    }

    fun clientContact(){

    }
}
