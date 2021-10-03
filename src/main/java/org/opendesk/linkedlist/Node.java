package org.opendesk.linkedlist;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class Node {
    private int value;
    private Node nextNode;

    @Override
    public String toString() {
        return "Node{" + "value= " + value + " }" ;

    }

}
