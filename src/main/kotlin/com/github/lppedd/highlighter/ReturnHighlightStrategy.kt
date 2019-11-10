package com.github.lppedd.highlighter

import com.intellij.psi.PsiElement

/**
 * @author Edoardo Luppi
 */
interface ReturnHighlightStrategy<T : PsiElement> {
  fun isValidContext(psiElement: T): Boolean

  enum class PsiResult {
    VALID,
    INVALID,
    CONTINUE
  }
}
