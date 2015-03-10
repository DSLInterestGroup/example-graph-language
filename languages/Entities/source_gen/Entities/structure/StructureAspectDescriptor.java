package Entities.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {

  /*package*/ final ConceptDescriptor myConceptBlackNode = new ConceptDescriptorBuilder("Entities.structure.BlackNode", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5393L)).super_("Entities.structure.Node").super_(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L)).parents("Entities.structure.Node").parentIds(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L)).create();
  /*package*/ final ConceptDescriptor myConceptEdge = new ConceptDescriptorBuilder("Entities.structure.Edge", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb855dL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L)).referenceDescriptors(new ConceptDescriptorBuilder.Ref(2704515845085431368L, "source", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L), false), new ConceptDescriptorBuilder.Ref(2704515845085431370L, "target", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L), false)).references("source", "target").abstract_().create();
  /*package*/ final ConceptDescriptor myConceptGraph = new ConceptDescriptorBuilder("Entities.structure.Graph", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbb6e622L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L)).childDescriptors(new ConceptDescriptorBuilder.Link(2704515845085418370L, "nodes", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L), true, true, false), new ConceptDescriptorBuilder.Link(2704515845085431353L, "edges", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb855dL), true, true, false)).children(new String[]{"nodes", "edges"}, new boolean[]{true, true}).create();
  /*package*/ final ConceptDescriptor myConceptNode = new ConceptDescriptorBuilder("Entities.structure.Node", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L)).abstract_().create();
  /*package*/ final ConceptDescriptor myConceptOrangeEdge = new ConceptDescriptorBuilder("Entities.structure.OrangeEdge", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb8566L)).super_("Entities.structure.Edge").super_(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb855dL)).parents("Entities.structure.Edge").parentIds(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb855dL)).create();
  /*package*/ final ConceptDescriptor myConceptPurpleEdge = new ConceptDescriptorBuilder("Entities.structure.PurpleEdge", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb8570L)).super_("Entities.structure.Edge").super_(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb855dL)).parents("Entities.structure.Edge").parentIds(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb855dL)).create();
  /*package*/ final ConceptDescriptor myConceptRedNode = new ConceptDescriptorBuilder("Entities.structure.RedNode", MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5394L)).super_("Entities.structure.Node").super_(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L)).parents("Entities.structure.Node").parentIds(MetaIdFactory.conceptId(0xd148f330d2ed4fdeL, 0x8721b49b33fc58f7L, 0x25885ed4fbbb5378L)).create();

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBlackNode, myConceptEdge, myConceptGraph, myConceptNode, myConceptOrangeEdge, myConceptPurpleEdge, myConceptRedNode);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0l, conceptFqName)) {
      case 0:
        return myConceptBlackNode;
      case 1:
        return myConceptEdge;
      case 2:
        return myConceptGraph;
      case 3:
        return myConceptNode;
      case 4:
        return myConceptOrangeEdge;
      case 5:
        return myConceptPurpleEdge;
      case 6:
        return myConceptRedNode;
      default:
        return null;
    }
  }
  private static String[] stringSwitchCases_1htk8d_a0a0l = new String[]{"Entities.structure.BlackNode", "Entities.structure.Edge", "Entities.structure.Graph", "Entities.structure.Node", "Entities.structure.OrangeEdge", "Entities.structure.PurpleEdge", "Entities.structure.RedNode"};
}