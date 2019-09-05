package com.lemon.idea.plugin.textprocessing.insert;

import com.intellij.openapi.editor.Caret;

import java.util.List;

public class NumberSequenceInsertingProcessor extends AbstractTextInsertingProcessor{

    @Override
    protected String makeInsertText(int index, Caret currentCaret, List<Caret> carets) {
        return ""+index;
    }
}
