package de.longuyen.drawing.shapes

import de.longuyen.drawing.core.AlgorithmContext
import java.awt.Color
import java.awt.Graphics

class Rectangle(override var color: IntArray,
                var x: Int,
                var y: Int,
                override var z: Int,
                var w: Int,
                var h: Int) : Shape {

    override fun draw(g: Graphics, algorithmContext: AlgorithmContext) {
        if (algorithmContext.useAlpha) {
            g.color = Color(color[0], color[1], color[2], color[3])
        } else {
            g.color = Color(color[0], color[1], color[2])
        }
        g.fillRect(x, y, w, h)
    }

    override fun copy(): Rectangle {
        return Rectangle(
                color = color.copyOf(),
                x = x,
                y = y,
                z = z,
                w = w,
                h = h
        )
    }
}