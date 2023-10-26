/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-039
 */
class DietCoke extends ColdDrink {
    @Override
    public float price() {
        return 25.0f; // Adjust price for diet version
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}
