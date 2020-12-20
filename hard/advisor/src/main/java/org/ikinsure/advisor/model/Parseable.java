package org.ikinsure.advisor.model;

import java.util.List;

/**
 * interface for models which can be parsed from json
 */
public interface Parseable {
    List<? extends Printable> parse(String data);
}
