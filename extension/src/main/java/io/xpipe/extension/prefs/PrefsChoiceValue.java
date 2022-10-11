package io.xpipe.extension.prefs;

import io.xpipe.extension.I18n;
import io.xpipe.extension.Translatable;
import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

public interface PrefsChoiceValue extends Translatable {

    @SuppressWarnings("unchecked")
    @SneakyThrows
    static <T> List<T> getAll(Class<T> type) {
        if (Enum.class.isAssignableFrom(type)) {
            return Arrays.asList(type.getEnumConstants());
        }

        try {
            type.getDeclaredField("ALL");
        } catch (NoSuchFieldException e) {
            return null;
        }

        try {
            return (List<T>) type.getDeclaredField("ALL").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return List.of(type.getEnumConstants());
        }
    }

    @SuppressWarnings("unchecked")
    static <T extends PrefsChoiceValue> List<T> getSupported(Class<T> type) {
        try {
            return (List<T>) type.getDeclaredField("SUPPORTED").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return getAll(type).stream().filter(t -> t.isSupported()).toList();
        }
    }

    default boolean isSupported() {
        return true;
    }

    @Override
    default String toTranslatedString() {
        return I18n.get(getId());
    }

    String getId();
}