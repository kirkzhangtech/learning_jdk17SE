/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2020 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_tg extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u042f\u043d\u0432\u0430\u0440",
               "\u0424\u0435\u0432\u0440\u0430\u043b",
               "\u041c\u0430\u0440\u0442",
               "\u0410\u043f\u0440\u0435\u043b",
               "\u041c\u0430\u0439",
               "\u0418\u044e\u043d",
               "\u0418\u044e\u043b",
               "\u0410\u0432\u0433\u0443\u0441\u0442",
               "\u0421\u0435\u043d\u0442\u044f\u0431\u0440",
               "\u041e\u043a\u0442\u044f\u0431\u0440",
               "\u041d\u043e\u044f\u0431\u0440",
               "\u0414\u0435\u043a\u0430\u0431\u0440",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "\u042f\u043d\u0432",
               "\u0424\u0435\u0432",
               "\u041c\u0430\u0440",
               "\u0410\u043f\u0440",
               "\u041c\u0430\u0439",
               "\u0418\u044e\u043d",
               "\u0418\u044e\u043b",
               "\u0410\u0432\u0433",
               "\u0421\u0435\u043d",
               "\u041e\u043a\u0442",
               "\u041d\u043e\u044f",
               "\u0414\u0435\u043a",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "\u042f",
               "\u0424",
               "\u041c",
               "\u0410",
               "\u041c",
               "\u0418",
               "\u0418",
               "\u0410",
               "\u0421",
               "\u041e",
               "\u041d",
               "\u0414",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "\u042f\u043a\u0448\u0430\u043d\u0431\u0435",
               "\u0414\u0443\u0448\u0430\u043d\u0431\u0435",
               "\u0421\u0435\u0448\u0430\u043d\u0431\u0435",
               "\u0427\u043e\u0440\u0448\u0430\u043d\u0431\u0435",
               "\u041f\u0430\u043d\u04b7\u0448\u0430\u043d\u0431\u0435",
               "\u04b6\u0443\u043c\u044a\u0430",
               "\u0428\u0430\u043d\u0431\u0435",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "\u042f\u0448\u0431",
               "\u0414\u0448\u0431",
               "\u0421\u0448\u0431",
               "\u0427\u0448\u0431",
               "\u041f\u0448\u0431",
               "\u04b6\u043c\u044a",
               "\u0428\u043d\u0431",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "\u042f",
               "\u0414",
               "\u0421",
               "\u0427",
               "\u041f",
               "\u04b6",
               "\u0428",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u04271",
               "\u04272",
               "\u04273",
               "\u04274",
            };
        final String[] metaValue_Eras = new String[] {
               "\u041f\u0435\u041c",
               "\u041f\u0430\u041c",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "HH:mm:ss zzzz",
               "HH:mm:ss z",
               "HH:mm:ss",
               "HH:mm",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_buddhist_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "",
               "",
               "",
               "",
               "",
               "",
               "",
               "",
               "",
               "",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE, dd MMMM y G",
               "dd MMMM y G",
               "dd MMM y G",
               "dd/MM/yy GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE, dd MMMM y GGGG",
               "dd MMMM y GGGG",
               "dd MMM y GGGG",
               "dd/MM/yy G",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "\u0421\u0410\u041d\u0410",
            };
        final String metaValue_calendarname_gregorian = "\u0422\u0430\u049b\u0432\u0438\u043c\u0438 \u0433\u0440\u0435\u0433\u043e\u0440\u0438\u0430\u043d\u04e3";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u0441\u043e\u043b" },
            { "islamic.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "japanese.AmPmMarkers", metaValue_buddhist_AmPmMarkers },
            { "islamic.AmPmMarkers", metaValue_buddhist_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "field.zone", "\u043c\u0438\u043d\u0442\u0430\u049b\u0430\u0438 \u0432\u0430\u049b\u0442" },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterAbbreviations", metaValue_QuarterNames },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "Eras", metaValue_Eras },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "roc.DayNames", metaValue_DayNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "\u041f\u0435\u0448 \u0430\u0437 \u043c\u0438\u043b\u043e\u0434",
                    "\u041f\u0430\u0441 \u0430\u0437 \u043c\u0438\u043b\u043e\u0434",
                }
            },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM'\u0438' y G",
                    "d MMMM'\u0438' y G",
                    "d MMM y G",
                    "M/d/y GGGGG",
                }
            },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "field.weekday", "\u0440\u04ef\u0437\u0438 \u04b3\u0430\u0444\u0442\u0430" },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u0434\u0430\u049b\u0438\u049b\u0430" },
            { "field.era", "\u043c\u0430\u0431\u0434\u0430\u0438 \u0442\u0430\u044a\u0440\u0438\u0445" },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_buddhist_AmPmMarkers },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.dayperiod", "AM/PM" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "islamic.MonthNames",
                new String[] {
                    "\u043c\u0443\u04b3\u0430\u0440\u0440\u0430\u043c",
                    "\u0441\u0430\u0444\u0430\u0440",
                    "\u0420\u0430\u0431\u0435\u044a I",
                    "\u0420\u0430\u0431\u0435\u044a II",
                    "\u04b7\u0438\u043c\u043e\u0434\u0438-\u0443\u043b-\u0443\u043b\u043e",
                    "\u04b7\u0438\u043c\u043e\u0434\u0438-\u0443\u043b-\u0441\u043e\u043d\u0438",
                    "\u0440\u0430\u04b7\u0430\u0431",
                    "\u0428\u0430\u0431\u0430\u043d",
                    "\u0420\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0428\u0430\u0432\u0432\u0430\u043b",
                    "\u0414\u0445\u0443\u0442-\u049a\u0438\u0434\u0430\u04b3",
                    "\u0414\u0445\u0443\u0442-\u04b2\u0438\u04b7\u04b7\u0430\u04b3",
                    "",
                }
            },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterNames },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM'\u0438' y GGGG",
                    "d MMMM'\u0438' y GGGG",
                    "d MMM y GGGG",
                    "M/d/y G",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_QuarterNames },
            { "japanese.DayNames", metaValue_DayNames },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "field.month", "\u043c\u043e\u04b3" },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "field.second", "\u0441\u043e\u043d\u0438\u044f" },
            { "roc.MonthNames", metaValue_MonthNames },
            { "field.week", "\u04b3\u0430\u0444\u0442\u0430" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_buddhist_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0\u00a0\u04b3\u0437\u0440'.'}",
                    "{other:00\u00a0\u04b3\u0437\u0440'.'}",
                    "{other:000\u00a0\u04b3\u0437\u0440'.'}",
                    "{other:0\u00a0\u043c\u043b\u043d'.'}",
                    "{other:00\u00a0\u043c\u043b\u043d'.'}",
                    "{other:000\u00a0\u043c\u043b\u043d'.'}",
                    "{other:0\u00a0\u043c\u043b\u0440\u0434'.'}",
                    "{other:00\u00a0\u043c\u043b\u0440\u0434'.'}",
                    "{other:000\u00a0\u043c\u043b\u0440\u0434'.'}",
                    "{other:0\u00a0\u0442\u0440\u043b\u043d'.'}",
                    "{other:00\u00a0\u0442\u0440\u043b\u043d'.'}",
                    "{other:000\u00a0\u0442\u0440\u043b\u043d'.'}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "DatePatterns",
                new String[] {
                    "EEEE, dd MMMM y",
                    "dd MMMM y",
                    "dd MMM y",
                    "dd/MM/yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "field.hour", "\u0441\u043e\u0430\u0442" },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u041c\u0443\u04b3.",
                    "\u0421\u0430\u0444.",
                    "\u0420\u0430\u0431. I",
                    "\u0420\u0430\u0431. II",
                    "\u04b6\u0443\u043c. I",
                    "\u04b6\u0443\u043c. II",
                    "\u0420\u0430\u04b7.",
                    "\u0428\u0430.",
                    "\u0420\u0430\u043c.",
                    "\u0428\u0430\u0432.",
                    "\u0414\u0445\u0443\u043b-\u049a.",
                    "\u0414\u0445\u0443\u043b-\u04b2.",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0' '\u04b3\u0430\u0437\u043e\u0440}",
                    "{other:00' '\u04b3\u0430\u0437\u043e\u0440}",
                    "{other:000' '\u04b3\u0430\u0437\u043e\u0440}",
                    "{other:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d}",
                    "{other:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d}",
                    "{other:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d}",
                    "{other:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434}",
                    "{other:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434}",
                    "{other:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434}",
                    "{other:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d}",
                    "{other:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d}",
                    "{other:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d}",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterNames },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
