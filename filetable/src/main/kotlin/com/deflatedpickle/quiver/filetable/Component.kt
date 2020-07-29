package com.deflatedpickle.quiver.filetable

import com.deflatedpickle.haruhi.component.PluginPanel
import com.deflatedpickle.rawky.ui.constraints.FillBothFinishLine
import java.awt.GridBagLayout

object Component : PluginPanel() {
    init {
        this.layout = GridBagLayout()

        this.add(Table, FillBothFinishLine)
    }
}