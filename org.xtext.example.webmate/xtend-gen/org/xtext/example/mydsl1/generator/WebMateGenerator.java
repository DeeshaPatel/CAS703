/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl1.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import webmate.Abbreviation;
import webmate.Attribute;
import webmate.HTMLTag;
import webmate.ID;
import webmate.SYM;
import webmate.Symbol;
import webmate.Tag;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WebMateGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String content = "";
    List<Abbreviation> _allContentsOfType = EcoreUtil2.<Abbreviation>getAllContentsOfType(IterableExtensions.<EObject>head(resource.getContents()), Abbreviation.class);
    for (final Abbreviation element : _allContentsOfType) {
      String _content = content;
      String _hTMLCode = this.toHTMLCode(element);
      content = (_content + _hTMLCode);
    }
    fsa.generateFile("index.html", content);
  }

  public String toHTMLCode(final Abbreviation element) {
    String _xblockexpression = null;
    {
      Tag tag = IterableExtensions.<Tag>head(element.getTags());
      final StringBuilder build = new StringBuilder();
      int flag = 0;
      boolean _isEmpty = element.getTags().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String s = this.toHTMLTag(element, tag);
        build.append(s);
        tag = IterableExtensions.<Tag>head(element.getTags());
        String _string = ((List<Object>)Conversions.doWrapArray(element.getSymbols().toArray())).toString();
        String _plus = ("Check me............" + _string);
        System.out.println(_plus);
        EList<Symbol> _symbols = element.getSymbols();
        for (final Symbol sym : _symbols) {
          boolean _isEmpty_1 = element.getSymbols().isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            Symbol in_sym = sym;
            SYM _sym = in_sym.getSym();
            String _plus_1 = ("HELLO" + _sym);
            System.out.println(_plus_1);
            SYM _sym_1 = sym.getSym();
            if (_sym_1 != null) {
              switch (_sym_1) {
                case GREATER:
                  EList<Symbol> _symbols_1 = element.getSymbols();
                  String _plus_2 = ("Check me A............" + _symbols_1);
                  System.out.println(_plus_2);
                  Symbol inn_tag = sym;
                  System.out.println("Check me B............");
                  build.append("\t");
                  String s1 = this.toHTMLTag(element, inn_tag.getTag());
                  build.append(s1);
                  HTMLTag _tagName = inn_tag.getTag().getTagName();
                  String _plus_3 = ("\t</" + _tagName);
                  String _plus_4 = (_plus_3 + ">");
                  build.append(_plus_4);
                  boolean _contains = ((List<Object>)Conversions.doWrapArray(element.getSymbols().toArray())).toString().contains("MULTIPLY");
                  if (_contains) {
                    EList<Symbol> _symbols_2 = element.getSymbols();
                    int _indexOf = element.getSymbols().indexOf(">");
                    int _plus_5 = (_indexOf + 2);
                    boolean _equals = _symbols_2.get(_plus_5).getSym().toString().equals("MULTIPLY");
                    if (_equals) {
                      System.out.println("B");
                      for (int i = 0; (i < (element.getSymbols().get((element.getSymbols().indexOf(">") + 2)).getCount() - 1)); i++) {
                        {
                          System.out.println("Check me A2............");
                          String s2 = this.toHTMLTag(element, inn_tag.getTag());
                          build.append(("\n\t" + s2));
                          HTMLTag _tagName_1 = inn_tag.getTag().getTagName();
                          String _plus_6 = ("</" + _tagName_1);
                          String _plus_7 = (_plus_6 + ">");
                          build.append(_plus_7);
                          System.out.println("Check me A3............");
                        }
                      }
                    }
                  }
                  break;
                case MULTIPLY:
                  int _count = in_sym.getCount();
                  String _plus_6 = ("Check me 1 ............" + Integer.valueOf(_count));
                  System.out.println(_plus_6);
                  int _count_1 = IterableExtensions.<Symbol>head(element.getSymbols()).getCount();
                  boolean _equals_1 = (_count_1 == 0);
                  boolean _not_2 = (!_equals_1);
                  if (_not_2) {
                    System.out.println("Check me 1 ............");
                    HTMLTag _tagName_1 = tag.getTagName();
                    String _plus_7 = ("</" + _tagName_1);
                    String _plus_8 = (_plus_7 + ">\n");
                    build.append(_plus_8);
                    for (int i = 0; (i < (IterableExtensions.<Symbol>head(element.getSymbols()).getCount() - 1)); i++) {
                      {
                        System.out.println("Check me 2............");
                        flag = 1;
                        String s1_1 = this.toHTMLTag(element, tag);
                        build.append(s1_1);
                        HTMLTag _tagName_2 = tag.getTagName();
                        String _plus_9 = ("</" + _tagName_2);
                        String _plus_10 = (_plus_9 + ">");
                        build.append(_plus_10);
                        build.append("\n");
                        System.out.println("Check me 3............");
                      }
                    }
                  }
                  break;
                case PLUS:
                  if ((flag == 0)) {
                    System.out.println("HEre is the problem");
                    tag = IterableExtensions.<Tag>head(element.getTags());
                    HTMLTag _tagName_2 = tag.getTagName();
                    String _plus_9 = ("</" + _tagName_2);
                    String _plus_10 = (_plus_9 + ">");
                    build.append(_plus_10);
                  }
                  Symbol temp_tag = sym;
                  System.out.println("Check me B............");
                  build.append("\n");
                  String s1_1 = this.toHTMLTag(element, temp_tag.getTag());
                  build.append(s1_1);
                  HTMLTag _tagName_3 = temp_tag.getTag().getTagName();
                  String _plus_11 = ("\n</" + _tagName_3);
                  String _plus_12 = (_plus_11 + ">");
                  build.append(_plus_12);
                  flag = 1;
                  break;
                default:
                  break;
              }
            }
          }
        }
        if ((flag == 0)) {
          tag = IterableExtensions.<Tag>head(element.getTags());
          HTMLTag _tagName_4 = tag.getTagName();
          String _plus_13 = ("\n</" + _tagName_4);
          String _plus_14 = (_plus_13 + ">");
          build.append(_plus_14);
        }
        flag = 0;
      }
      boolean _isEmpty_2 = element.getIds().isEmpty();
      boolean _not_3 = (!_isEmpty_2);
      if (_not_3) {
        String _idName = IterableExtensions.<ID>head(element.getIds()).getIdName();
        String _plus_15 = (" id= " + _idName);
        build.append(_plus_15);
      }
      _xblockexpression = build.toString();
    }
    return _xblockexpression;
  }

  public String toHTMLTag(final Abbreviation element, final Tag tag) {
    String _xifexpression = null;
    HTMLTag _tagName = tag.getTagName();
    boolean _tripleNotEquals = (_tagName != null);
    if (_tripleNotEquals) {
      String _xblockexpression = null;
      {
        final StringBuilder build = new StringBuilder();
        build.append("<");
        build.append(tag.getTagName());
        ID _id = tag.getId();
        boolean _tripleNotEquals_1 = (_id != null);
        if (_tripleNotEquals_1) {
          String _idName = tag.getId().getIdName();
          String _plus = (" id=" + _idName);
          build.append(_plus);
        }
        if (((!tag.getClass_().isEmpty()) || (!element.getClasses().isEmpty()))) {
          final Function1<webmate.Class, String> _function = (webmate.Class class_) -> {
            return class_.getClassName();
          };
          String _join = IterableExtensions.join(ListExtensions.<webmate.Class, String>map(tag.getClass_(), _function), " ");
          String _plus_1 = (" class=" + _join);
          build.append(_plus_1);
          final Function1<webmate.Class, String> _function_1 = (webmate.Class class_) -> {
            return class_.getClassName();
          };
          String _join_1 = IterableExtensions.join(ListExtensions.<webmate.Class, String>map(element.getClasses(), _function_1), " ");
          String _plus_2 = (" " + _join_1);
          build.append(_plus_2);
        }
        EList<Attribute> _attributes = element.getAttributes();
        for (final Attribute attribute : _attributes) {
          String _attributeName = attribute.getAttributeName();
          String _plus_3 = (" " + _attributeName);
          String _plus_4 = (_plus_3 + "=");
          String _attributeValue = attribute.getAttributeValue();
          String _plus_5 = (_plus_4 + _attributeValue);
          build.append(_plus_5);
        }
        EList<Attribute> _attribute = tag.getAttribute();
        for (final Attribute att : _attribute) {
          String _attributeName_1 = att.getAttributeName();
          String _plus_6 = (" " + _attributeName_1);
          String _plus_7 = (_plus_6 + "=");
          String _attributeValue_1 = att.getAttributeValue();
          String _plus_8 = (_plus_7 + _attributeValue_1);
          build.append(_plus_8);
        }
        String _inputString = tag.getInputString();
        boolean _tripleNotEquals_2 = (_inputString != null);
        if (_tripleNotEquals_2) {
          build.append(">");
          build.append(tag.getInputString());
        } else {
          build.append("> \n");
        }
        _xblockexpression = build.toString();
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
