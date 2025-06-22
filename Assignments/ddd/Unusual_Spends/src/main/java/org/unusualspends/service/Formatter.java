package org.unusualspends.service;

import org.unusualspends.dto.UnusualSpend;

import java.util.List;

public interface Formatter {
    String formatMessage(List<UnusualSpend> unusualSpends, String firstName);
}
