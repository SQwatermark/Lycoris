package io.github.douira.glsl_transformer.token_filter;

import java.util.Set;

import move.org.antlr.v4.runtime.Token;

import io.github.douira.glsl_transformer.ast.transform.JobParameters;
import io.github.douira.glsl_transformer.util.CompatUtil;

/**
 * The string token filter disallows tokens that are matched against a set of
 * disallowed strings.
 */
public class StringFilter<J extends JobParameters> extends TokenFilter<J> {
  private Set<String> disallowed;

  /**
   * Creates a new string token filter with a set of disallowed strings.
   * 
   * @param disallowed The strings to match
   */
  public StringFilter(Set<String> disallowed) {
    this.disallowed = disallowed;
  }

  /**
   * Creates a new string token filter with a single disallowed string.
   * 
   * @param disallowed The string to match
   */
  public StringFilter(String disallowed) {
    this.disallowed = CompatUtil.setOf(disallowed);
  }

  /**
   * Creates a new string token filter with an array of disallowed strings.
   * 
   * @param disallowed The strings to match
   */
  public StringFilter(String... disallowed) {
    this.disallowed = CompatUtil.setOf(disallowed);
  }

  @Override
  public boolean isTokenAllowed(Token token) {
    return !disallowed.contains(token.getText());
  }
}
