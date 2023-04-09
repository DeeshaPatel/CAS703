/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl1.generator;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Stack;
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
      final Stack<HTMLTag> stack = new Stack<HTMLTag>();
      int flag = 0;
      boolean _isEmpty = element.getTags().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        build.append("<");
        String s = this.toHTMLTag(element, tag);
        build.append(s);
        build.append("> \n");
        tag = IterableExtensions.<Tag>head(element.getTags());
        String _string = ((List<Object>)Conversions.doWrapArray(element.getSymbols().toArray())).toString();
        String _plus = ("Check me............" + _string);
        System.out.println(_plus);
        boolean _isEmpty_1 = element.getSymbols().isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          EList<Symbol> _symbols = element.getSymbols();
          for (final Symbol in_sym : _symbols) {
            {
              SYM _sym = in_sym.getSym();
              String _plus_1 = ("HELLO" + _sym);
              System.out.println(_plus_1);
              SYM _sym_1 = in_sym.getSym();
              if (_sym_1 != null) {
                switch (_sym_1) {
                  case GREATER:
                    EList<Symbol> _symbols_1 = element.getSymbols();
                    String _plus_2 = ("Check me A............" + _symbols_1);
                    System.out.println(_plus_2);
                    EList<Symbol> _symbols_2 = element.getSymbols();
                    for (final Symbol inn_tag : _symbols_2) {
                      SYM _sym_2 = in_sym.getSym();
                      boolean _notEquals = (!Objects.equal(_sym_2, "GREATER"));
                      if (_notEquals) {
                      } else {
                        System.out.println("Check me B............");
                        build.append("\t <");
                        String s1 = this.toHTMLTag(element, inn_tag.getTag());
                        build.append(s1);
                        build.append(">");
                        stack.push(inn_tag.getTag().getTagName());
                      }
                    }
                    for (int i = (stack.size() - 1); (i >= 0); i--) {
                      HTMLTag _pop = stack.pop();
                      String _plus_3 = ("</" + _pop);
                      String _plus_4 = (_plus_3 + ">");
                      build.append(_plus_4);
                    }
                    break;
                  case MULTIPLY:
                    if (((!element.getSymbols().isEmpty()) && (!(element.getSymbols().get(0).getCount() == 0)))) {
                      System.out.println("Check me 1 ............");
                      for (int i = 0; (i < (IterableExtensions.<Symbol>head(element.getSymbols()).getCount() - 1)); i++) {
                        {
                          System.out.println("Check me 2............");
                          build.append("<");
                          String s1_1 = this.toHTMLTag(element, tag);
                          build.append(s1_1);
                          build.append(">");
                          build.append("\n");
                          HTMLTag _tagName = tag.getTagName();
                          String _plus_3 = ("</" + _tagName);
                          String _plus_4 = (_plus_3 + ">");
                          build.append(_plus_4);
                          build.append("\n");
                          System.out.println("Check me 3............");
                        }
                      }
                    }
                    break;
                  case PLUS:
                    break;
                  default:
                    break;
                }
              }
            }
          }
        }
        if ((flag == 0)) {
          tag = IterableExtensions.<Tag>head(element.getTags());
          HTMLTag _tagName = tag.getTagName();
          String _plus_1 = ("\n</" + _tagName);
          String _plus_2 = (_plus_1 + ">");
          build.append(_plus_2);
        }
        flag = 0;
      }
      boolean _isEmpty_2 = element.getIds().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        String _idName = IterableExtensions.<ID>head(element.getIds()).getIdName();
        String _plus_3 = (" id= " + _idName);
        build.append(_plus_3);
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
        _xblockexpression = build.toString();
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
