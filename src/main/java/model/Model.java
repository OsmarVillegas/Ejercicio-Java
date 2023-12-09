/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author empan
 */
public class Model {
    private final List<String> todos;

    public Model() {
        this.todos = new ArrayList<>();
    }

    public void addTodo(String todo) {
        todos.add(todo);
    }

    public List<String> getTodos() {
        return todos;
    }
}
