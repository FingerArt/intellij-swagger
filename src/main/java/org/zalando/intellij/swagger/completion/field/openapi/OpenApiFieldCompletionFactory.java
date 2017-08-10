package org.zalando.intellij.swagger.completion.field.openapi;

import com.intellij.codeInsight.completion.CompletionResultSet;
import org.zalando.intellij.swagger.completion.OpenApiCompletionHelper;
import org.zalando.intellij.swagger.completion.field.FieldCompletion;
import org.zalando.intellij.swagger.completion.field.common.InfoCompletion;

import java.util.Optional;

public class OpenApiFieldCompletionFactory {

    public static Optional<FieldCompletion> from(final OpenApiCompletionHelper completionHelper,
                                                 final CompletionResultSet completionResultSet) {
        if (completionHelper.completeRootKey()) {
            return Optional.of(new RootCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeInfoKey()) {
            return Optional.of(new InfoCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeServerKey()) {
            return Optional.of(new ServerCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeServerVariableKey()) {
            return Optional.of(new ServerVariableCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completePathKey()) {
            return Optional.of(new PathCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeOperationKey()) {
            return Optional.of(new OperationCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeParametersKey()) {
            return Optional.of(new ParameterCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeComponentKey()) {
            return Optional.of(new ComponentCompletion(completionHelper, completionResultSet));
        } else if (completionHelper.completeTagKey()) {
            return Optional.of(new TagCompletion(completionHelper, completionResultSet));
        } else {
            return Optional.empty();
        }
    }
}
