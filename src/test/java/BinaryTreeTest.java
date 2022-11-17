import com.binarytree.Node;
import com.binarytree.BinaryTree;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest extends TestCase {
    BinaryTree<String> bt;
    Node<String> I;
    Node<String> D;
    Node<String> DD;
    Node<String> DDD;

    @Before
    public void setUp() throws Exception {
        bt = new BinaryTree<>("Miguel2");
        I = bt.insert("HI1", bt.getRoot(), true);
        D = bt.insert("D1", bt.getRoot(), false);
        DD = bt.insert("DD1", D, false);
        DDD = bt.insert("DDD1", DD, false);
        System.out.println(bt);
    }

    @Test
    public void testSize() {
        Assert.assertEquals(5, bt.size());
    }

    @Test
    public void testDepth() {
        fail("Not implemented yet");
    }

}
