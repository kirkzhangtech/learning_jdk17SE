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

public class FormatData_ru extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u044f\u043d\u0432\u0430\u0440\u044f",
               "\u0444\u0435\u0432\u0440\u0430\u043b\u044f",
               "\u043c\u0430\u0440\u0442\u0430",
               "\u0430\u043f\u0440\u0435\u043b\u044f",
               "\u043c\u0430\u044f",
               "\u0438\u044e\u043d\u044f",
               "\u0438\u044e\u043b\u044f",
               "\u0430\u0432\u0433\u0443\u0441\u0442\u0430",
               "\u0441\u0435\u043d\u0442\u044f\u0431\u0440\u044f",
               "\u043e\u043a\u0442\u044f\u0431\u0440\u044f",
               "\u043d\u043e\u044f\u0431\u0440\u044f",
               "\u0434\u0435\u043a\u0430\u0431\u0440\u044f",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "\u044f\u043d\u0432.",
               "\u0444\u0435\u0432\u0440.",
               "\u043c\u0430\u0440.",
               "\u0430\u043f\u0440.",
               "\u043c\u0430\u044f",
               "\u0438\u044e\u043d.",
               "\u0438\u044e\u043b.",
               "\u0430\u0432\u0433.",
               "\u0441\u0435\u043d\u0442.",
               "\u043e\u043a\u0442.",
               "\u043d\u043e\u044f\u0431.",
               "\u0434\u0435\u043a.",
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
               "\u0432\u043e\u0441\u043a\u0440\u0435\u0441\u0435\u043d\u044c\u0435",
               "\u043f\u043e\u043d\u0435\u0434\u0435\u043b\u044c\u043d\u0438\u043a",
               "\u0432\u0442\u043e\u0440\u043d\u0438\u043a",
               "\u0441\u0440\u0435\u0434\u0430",
               "\u0447\u0435\u0442\u0432\u0435\u0440\u0433",
               "\u043f\u044f\u0442\u043d\u0438\u0446\u0430",
               "\u0441\u0443\u0431\u0431\u043e\u0442\u0430",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "\u0432\u0441",
               "\u043f\u043d",
               "\u0432\u0442",
               "\u0441\u0440",
               "\u0447\u0442",
               "\u043f\u0442",
               "\u0441\u0431",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "1-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
               "2-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
               "3-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
               "4-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "1-\u0439 \u043a\u0432.",
               "2-\u0439 \u043a\u0432.",
               "3-\u0439 \u043a\u0432.",
               "4-\u0439 \u043a\u0432.",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u043f\u043e\u043b\u043d\u043e\u0447\u044c",
               "\u043f\u043e\u043b\u0434\u0435\u043d\u044c",
               "\u0443\u0442\u0440\u0430",
               "",
               "\u0434\u043d\u044f",
               "",
               "\u0432\u0435\u0447\u0435\u0440\u0430",
               "",
               "\u043d\u043e\u0447\u0438",
               "",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u043f\u043e\u043b\u043d.",
               "\u043f\u043e\u043b\u0434.",
               "\u0443\u0442\u0440\u0430",
               "",
               "\u0434\u043d\u044f",
               "",
               "\u0432\u0435\u0447.",
               "",
               "\u043d\u043e\u0447\u0438",
               "",
            };
        final String[] metaValue_abbreviated_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u043f\u043e\u043b\u043d.",
               "\u043f\u043e\u043b\u0434.",
               "\u0443\u0442\u0440\u0430",
               "",
               "\u0434\u043d\u044f",
               "",
               "\u0432\u0435\u0447\u0435\u0440\u0430",
               "",
               "\u043d\u043e\u0447\u0438",
               "",
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
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "\u0431\u0443\u0434\u0434\u0438\u0439\u0441\u043a\u0430\u044f \u044d\u0440\u0430",
            };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
               "BC",
               "BE",
            };
        final String[] metaValue_java_time_buddhist_narrow_Eras = new String[] {
               "BC",
               "\u0431\u044d",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE, d MMMM y '\u0433'. G",
               "d MMMM y '\u0433'. G",
               "d MMM y '\u0433'. G",
               "dd.MM.y G",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE, d MMMM y '\u0433'. GGGG",
               "d MMMM y '\u0433'. GGGG",
               "d MMM y '\u0433'. GGGG",
               "dd.MM.y GGGG",
            };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
               "\u043e\u0442 \u0420\u043e\u0436\u0434\u0435\u0441\u0442\u0432\u0430 \u0425\u0440\u0438\u0441\u0442\u043e\u0432\u0430",
               "\u042d\u043f\u043e\u0445\u0430 \u041c\u044d\u0439\u0434\u0437\u0438",
               "\u042d\u043f\u043e\u0445\u0430 \u0422\u0430\u0439\u0441\u044c\u043e",
               "\u0421\u044c\u043e\u0432\u0430",
               "\u042d\u043f\u043e\u0445\u0430 \u0425\u044d\u0439\u0441\u044d\u0439",
               "\u0420\u044d\u0439\u0432\u0430",
            };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
               "\u043d. \u044d.",
               "\u042d\u043f\u043e\u0445\u0430 \u041c\u044d\u0439\u0434\u0437\u0438",
               "\u042d\u043f\u043e\u0445\u0430 \u0422\u0430\u0439\u0441\u044c\u043e",
               "\u0421\u044c\u043e\u0432\u0430",
               "\u042d\u043f\u043e\u0445\u0430 \u0425\u044d\u0439\u0441\u044d\u0439",
               "\u0420\u044d\u0439\u0432\u0430",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "\u0434\u043e \u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u044f \u041a\u0438\u0442\u0430\u0439\u0441\u043a\u043e\u0439 \u0440\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0438",
               "\u041c\u0438\u043d\u044c\u0433\u043e",
            };
        final String[] metaValue_java_time_roc_Eras = new String[] {
               "Before R.O.C.",
               "Minguo",
            };
        final String[] metaValue_java_time_roc_narrow_Eras = new String[] {
               "\u0434\u043e \u0440\u0435\u0441\u043f.",
               "\u041c\u0438\u043d\u044c\u0433\u043e",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "\u043f\u043e\u0441\u043b\u0435 \u0445\u0438\u0434\u0436\u0440\u044b",
            };
        final String[] metaValue_java_time_islamic_Eras = new String[] {
               "",
               "AH",
            };
        final String metaValue_calendarname_gregorian = "\u0433\u0440\u0438\u0433\u043e\u0440\u0438\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u0433\u043e\u0434" },
            { "calendarname.islamic-umalqura", "\u0438\u0441\u043b\u0430\u043c\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c (\u0423\u043c\u043c \u0430\u043b\u044c-\u041a\u0443\u0440\u0430)" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438\u0439 \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "narrow.Eras",
                new String[] {
                    "\u0434\u043e \u043d.\u044d.",
                    "\u043d.\u044d.",
                }
            },
            { "abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "timezone.regionFormat.standard", "{0}, \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e\u0435 \u0432\u0440\u0435\u043c\u044f" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u044f\u043f\u043e\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_Eras },
            { "long.Eras",
                new String[] {
                    "\u0434\u043e \u0420\u043e\u0436\u0434\u0435\u0441\u0442\u0432\u0430 \u0425\u0440\u0438\u0441\u0442\u043e\u0432\u0430",
                    "\u043e\u0442 \u0420\u043e\u0436\u0434\u0435\u0441\u0442\u0432\u0430 \u0425\u0440\u0438\u0441\u0442\u043e\u0432\u0430",
                }
            },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
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
                    "\u043d\u0435\u00a0\u0447\u0438\u0441\u043b\u043e",
                    "",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u043c\u0438\u043d\u0443\u0442\u0430" },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.era", "\u044d\u0440\u0430" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "AM/PM" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.MonthNames",
                new String[] {
                    "\u043c\u0443\u0445\u0430\u0440\u0440\u0430\u043c",
                    "\u0441\u0430\u0444\u0430\u0440",
                    "\u0440\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0440\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0434\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0434\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0440\u0430\u0434\u0436\u0430\u0431",
                    "\u0448\u0430\u0430\u0431\u0430\u043d",
                    "\u0440\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0448\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0437\u0443\u043b\u044c-\u043a\u0430\u0430\u0434\u0430",
                    "\u0437\u0443\u043b\u044c-\u0445\u0438\u0434\u0436\u0436\u0430",
                    "",
                }
            },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "calendarname.roc", "\u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c \u041c\u0438\u043d\u044c\u0433\u043e" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_Eras },
            { "field.month", "\u043c\u0435\u0441\u044f\u0446" },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "field.second", "\u0441\u0435\u043a\u0443\u043d\u0434\u0430" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayAbbreviations },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "\u0438\u0441\u043b\u0430\u043c\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:22:00-04:00;afternoon1:12:00-18:00;morning1:04:00-12:00;evening1:18:00-22:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_narrow_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u044f\u043d\u0432.",
                    "\u0444\u0435\u0432\u0440.",
                    "\u043c\u0430\u0440\u0442",
                    "\u0430\u043f\u0440.",
                    "\u043c\u0430\u0439",
                    "\u0438\u044e\u043d\u044c",
                    "\u0438\u044e\u043b\u044c",
                    "\u0430\u0432\u0433.",
                    "\u0441\u0435\u043d\u0442.",
                    "\u043e\u043a\u0442.",
                    "\u043d\u043e\u044f\u0431.",
                    "\u0434\u0435\u043a.",
                    "",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u0442\u044b\u0441\u044f\u0447\u0430 few:0' '\u0442\u044b\u0441\u044f\u0447\u0438 many:0' '\u0442\u044b\u0441\u044f\u0447 other:0' '\u0442\u044b\u0441\u044f\u0447\u0438}",
                    "{one:00' '\u0442\u044b\u0441\u044f\u0447\u0430 few:00' '\u0442\u044b\u0441\u044f\u0447\u0438 many:00' '\u0442\u044b\u0441\u044f\u0447 other:00' '\u0442\u044b\u0441\u044f\u0447\u0438}",
                    "{one:000' '\u0442\u044b\u0441\u044f\u0447\u0430 few:000' '\u0442\u044b\u0441\u044f\u0447\u0438 many:000' '\u0442\u044b\u0441\u044f\u0447 other:000' '\u0442\u044b\u0441\u044f\u0447\u0438}",
                    "{one:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d few:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d few:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d few:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434 few:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430 many:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u043e\u0432 other:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430}",
                    "{one:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434 few:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430 many:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u043e\u0432 other:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430}",
                    "{one:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434 few:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430 many:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u043e\u0432 other:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430}",
                    "{one:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d few:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d few:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d few:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "standalone.DayNarrows",
                new String[] {
                    "\u0412",
                    "\u041f",
                    "\u0412",
                    "\u0421",
                    "\u0427",
                    "\u041f",
                    "\u0421",
                }
            },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayAbbreviations },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "field.zone", "\u0447\u0430\u0441\u043e\u0432\u043e\u0439 \u043f\u043e\u044f\u0441" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_java_time_roc_narrow_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "Eras",
                new String[] {
                    "\u0434\u043e \u043d. \u044d.",
                    "\u043d. \u044d.",
                }
            },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "\u0434\u0435\u043d\u044c \u043d\u0435\u0434\u0435\u043b\u0438" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_Eras },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "field.week", "\u043d\u0435\u0434\u0435\u043b\u044f" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayAbbreviations },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0\u0442\u044b\u0441'.' few:0\u00a0\u0442\u044b\u0441'.' many:0\u00a0\u0442\u044b\u0441'.' other:0\u00a0\u0442\u044b\u0441'.'}",
                    "{one:00\u00a0\u0442\u044b\u0441'.' few:00\u00a0\u0442\u044b\u0441'.' many:00\u00a0\u0442\u044b\u0441'.' other:00\u00a0\u0442\u044b\u0441'.'}",
                    "{one:000\u00a0\u0442\u044b\u0441'.' few:000\u00a0\u0442\u044b\u0441'.' many:000\u00a0\u0442\u044b\u0441'.' other:000\u00a0\u0442\u044b\u0441'.'}",
                    "{one:0\u00a0\u043c\u043b\u043d few:0\u00a0\u043c\u043b\u043d many:0\u00a0\u043c\u043b\u043d other:0\u00a0\u043c\u043b\u043d}",
                    "{one:00\u00a0\u043c\u043b\u043d few:00\u00a0\u043c\u043b\u043d many:00\u00a0\u043c\u043b\u043d other:00\u00a0\u043c\u043b\u043d}",
                    "{one:000\u00a0\u043c\u043b\u043d few:000\u00a0\u043c\u043b\u043d many:000\u00a0\u043c\u043b\u043d other:000\u00a0\u043c\u043b\u043d}",
                    "{one:0\u00a0\u043c\u043b\u0440\u0434 few:0\u00a0\u043c\u043b\u0440\u0434 many:0\u00a0\u043c\u043b\u0440\u0434 other:0\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:00\u00a0\u043c\u043b\u0440\u0434 few:00\u00a0\u043c\u043b\u0440\u0434 many:00\u00a0\u043c\u043b\u0440\u0434 other:00\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:000\u00a0\u043c\u043b\u0440\u0434 few:000\u00a0\u043c\u043b\u0440\u0434 many:000\u00a0\u043c\u043b\u0440\u0434 other:000\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:0\u00a0\u0442\u0440\u043b\u043d few:0\u00a0\u0442\u0440\u043b\u043d many:0\u00a0\u0442\u0440\u043b\u043d other:0\u00a0\u0442\u0440\u043b\u043d}",
                    "{one:00\u00a0\u0442\u0440\u043b\u043d few:00\u00a0\u0442\u0440\u043b\u043d many:00\u00a0\u0442\u0440\u043b\u043d other:00\u00a0\u0442\u0440\u043b\u043d}",
                    "{one:000\u00a0\u0442\u0440\u043b\u043d few:000\u00a0\u0442\u0440\u043b\u043d many:000\u00a0\u0442\u0440\u043b\u043d other:000\u00a0\u0442\u0440\u043b\u043d}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "timezone.regionFormat.daylight", "{0}, \u043b\u0435\u0442\u043d\u0435\u0435 \u0432\u0440\u0435\u043c\u044f" },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y '\u0433'.",
                    "d MMMM y '\u0433'.",
                    "d MMM y '\u0433'.",
                    "dd.MM.y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "PluralRules", "one:v = 0 and i % 10 = 1 and i % 100 != 11;few:v = 0 and i % 10 = 2..4 and i % 100 != 12..14;many:v = 0 and i % 10 = 0 or v = 0 and i % 10 = 5..9 or v = 0 and i % 100 = 11..14" },
            { "field.hour", "\u0447\u0430\u0441" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u043c\u0443\u0445.",
                    "\u0441\u0430\u0444.",
                    "\u0440\u0430\u0431. I",
                    "\u0440\u0430\u0431. II",
                    "\u0434\u0436\u0443\u043c. I",
                    "\u0434\u0436\u0443\u043c. II",
                    "\u0440\u0430\u0434\u0436.",
                    "\u0448\u0430\u0430\u0431.",
                    "\u0440\u0430\u043c.",
                    "\u0448\u0430\u0432.",
                    "\u0437\u0443\u043b\u044c-\u043a.",
                    "\u0437\u0443\u043b\u044c-\u0445.",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_Eras },
            { "calendarname.buddhist", "\u0431\u0443\u0434\u0434\u0438\u0439\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "standalone.MonthNames",
                new String[] {
                    "\u044f\u043d\u0432\u0430\u0440\u044c",
                    "\u0444\u0435\u0432\u0440\u0430\u043b\u044c",
                    "\u043c\u0430\u0440\u0442",
                    "\u0430\u043f\u0440\u0435\u043b\u044c",
                    "\u043c\u0430\u0439",
                    "\u0438\u044e\u043d\u044c",
                    "\u0438\u044e\u043b\u044c",
                    "\u0430\u0432\u0433\u0443\u0441\u0442",
                    "\u0441\u0435\u043d\u0442\u044f\u0431\u0440\u044c",
                    "\u043e\u043a\u0442\u044f\u0431\u0440\u044c",
                    "\u043d\u043e\u044f\u0431\u0440\u044c",
                    "\u0434\u0435\u043a\u0430\u0431\u0440\u044c",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayAbbreviations },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayAbbreviations },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
