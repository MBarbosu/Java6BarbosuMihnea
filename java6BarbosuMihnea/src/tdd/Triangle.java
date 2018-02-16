/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author SkullFlight
 */
public class Triangle extends F2D{
    private String definitionFirst = "Triangle  : ";
    
    private String definitionSecond = "with three straight sides and three angles.";

    /**
     * Get the value of definitionSecond
     *
     * @return the value of definitionSecond
     */
    public String getDefinitionSecond() {
        return definitionSecond;
    }

    /**
     * Set the value of definitionSecond
     *
     * @param definitionSecond new value of definitionSecond
     */
    public void setDefinitionSecond(String definitionSecond) {
        this.definitionSecond = definitionSecond;
    }


    /**
     * Get the value of definition
     *
     * @return the value of definition
     */
    public String getDefinitionFirst() {
        return definitionFirst;
    }

    /**
     * Set the value of definition
     *
     * @param definition new value of definition
     */
    public void setDefinitionFirst(String definition) {
        this.definitionFirst = definition;
    }

    public String getDefinition(){
        StringBuffer response = new StringBuffer(definitionFirst);
        response.append(super.getDefinition());
        response.append(super.getDefinition2D());
        response.append(definitionSecond);
        return(response.toString());
    } 
}
