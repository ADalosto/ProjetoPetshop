/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopetshop;

/**
 *
 * @author Andrey Dalosto
 */
public class StringVazioException extends RuntimeException{
    @Override
    public String getMessage()
    {
    return "Campo Vázio.Tente Novamente";
    }
}
