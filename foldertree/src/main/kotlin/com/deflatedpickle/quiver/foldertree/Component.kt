package com.deflatedpickle.quiver.foldertree

import com.deflatedpickle.haruhi.component.PluginPanel
import com.deflatedpickle.rawky.ui.constraints.FillBothFinishLine
import java.awt.GridBagLayout
import javax.swing.JScrollPane

object Component : PluginPanel() {
    init {
        this.layout = GridBagLayout()

        this.add(JScrollPane(Tree), FillBothFinishLine)
    }
}