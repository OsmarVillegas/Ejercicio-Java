/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.List;
import model.Model;
import view.View;

/**
 *
 * @author empan
 */
public class Controller {

    private Model model;
    private View view;

    public Controller() {
        this.model = new Model();
        this.view = new View();
    }

    public void addTodo(String todo) {
        model.addTodo(todo);
    }

    public void getTodo() {
        view.showTodos((List<String>) model.getTodos());
    }

}
