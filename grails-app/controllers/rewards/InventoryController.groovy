package rewards

class InventoryController {

    def index() {
        render "Here is a list of everything."
    }

    def edit() {
        def productName = "Breakfast Blend"
        def sku = "BB01"
        ////map sends data to a view
        //often the placeholder has the same name as the variable
        [product:productName, sku:sku]
    }

    def remove() {
        render "An item was removed."
    }
}
