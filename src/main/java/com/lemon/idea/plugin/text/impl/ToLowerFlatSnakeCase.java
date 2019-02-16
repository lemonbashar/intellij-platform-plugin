package com.lemon.idea.plugin.text.impl;

import com.lemon.framework.textprocessing.text.impl.ToLowerSnakeCaseProcessor;
import com.lemon.idea.plugin.text.TextAction;

public class ToLowerFlatSnakeCase extends TextAction {
    public ToLowerFlatSnakeCase() {
        super(new ToLowerSnakeCaseProcessor());
    }
}