package com.deflatedpickle.quiver.textviewer

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea

class Component : RSyntaxTextArea() {
    init {
        this.isEnabled = false

        this.isCodeFoldingEnabled = true
    }
}