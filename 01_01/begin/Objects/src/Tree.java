package begin.Objects.src;

import java.awt.*;

public class Tree {
    double height;
    double trunkDiameter;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    void grow() {
        this.height =  this.height+10;
        this.trunkDiameter = this.trunkDiameter+1;
    }

    static void announceTree() {
        System.out.println("Here is a tree with trunk color "+ TRUNK_COLOR);
    }

    void isTall() {
        if (this.height > 100) {
            System.out.println("Tall tree " + this.treeType);
        }
    }
}

