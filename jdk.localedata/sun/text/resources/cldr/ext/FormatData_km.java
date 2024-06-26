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

public class FormatData_km extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u1798\u1780\u179a\u17b6",
               "\u1780\u17bb\u1798\u17d2\u1797\u17c8",
               "\u1798\u17b8\u1793\u17b6",
               "\u1798\u17c1\u179f\u17b6",
               "\u17a7\u179f\u1797\u17b6",
               "\u1798\u17b7\u1790\u17bb\u1793\u17b6",
               "\u1780\u1780\u17d2\u1780\u178a\u17b6",
               "\u179f\u17b8\u17a0\u17b6",
               "\u1780\u1789\u17d2\u1789\u17b6",
               "\u178f\u17bb\u179b\u17b6",
               "\u179c\u17b7\u1785\u17d2\u1786\u17b7\u1780\u17b6",
               "\u1792\u17d2\u1793\u17bc",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "\u1798",
               "\u1780",
               "\u1798",
               "\u1798",
               "\u17a7",
               "\u1798",
               "\u1780",
               "\u179f",
               "\u1780",
               "\u178f",
               "\u179c",
               "\u1792",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "\u17a2\u17b6\u1791\u17b7\u178f\u17d2\u1799",
               "\u1785\u17d0\u1793\u17d2\u1791",
               "\u17a2\u1784\u17d2\u1782\u17b6\u179a",
               "\u1796\u17bb\u1792",
               "\u1796\u17d2\u179a\u17a0\u179f\u17d2\u1794\u178f\u17b7\u17cd",
               "\u179f\u17bb\u1780\u17d2\u179a",
               "\u179f\u17c5\u179a\u17cd",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "\u17a2\u17b6\u1791\u17b7\u178f\u17d2\u1799",
               "\u1785\u1793\u17d2\u1791",
               "\u17a2\u1784\u17d2\u1782\u17b6\u179a",
               "\u1796\u17bb\u1792",
               "\u1796\u17d2\u179a\u17a0",
               "\u179f\u17bb\u1780\u17d2\u179a",
               "\u179f\u17c5\u179a\u17cd",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "\u17a2",
               "\u1785",
               "\u17a2",
               "\u1796",
               "\u1796",
               "\u179f",
               "\u179f",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u178f\u17d2\u179a\u17b8\u1798\u17b6\u179f\u1791\u17b8 1",
               "\u178f\u17d2\u179a\u17b8\u1798\u17b6\u179f\u1791\u17b8 2",
               "\u178f\u17d2\u179a\u17b8\u1798\u17b6\u179f\u1791\u17b8 3",
               "\u178f\u17d2\u179a\u17b8\u1798\u17b6\u179f\u1791\u17b8 4",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u17a2\u1792\u17d2\u179a\u17b6\u178f\u17d2\u179a",
               "\u1790\u17d2\u1784\u17c3\u178f\u17d2\u179a\u1784\u17cb",
               "\u1793\u17c5\u1796\u17c1\u179b\u200b\u1796\u17d2\u179a\u17b9\u1780",
               "",
               "\u1793\u17c5\u1796\u17c1\u179b\u179a\u179f\u17c0\u179b",
               "",
               "\u1793\u17c5\u1796\u17c1\u179b\u200b\u179b\u17d2\u1784\u17b6\u1785",
               "",
               "\u1793\u17c5\u1796\u17c1\u179b\u200b\u1799\u1794\u17cb",
               "",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "a",
               "p",
               "\u17a2\u1792\u17d2\u179a\u17b6\u178f\u17d2\u179a",
               "\u1790\u17d2\u1784\u17c3\u178f\u17d2\u179a\u1784\u17cb",
               "\u1793\u17c5\u1796\u17c1\u179b\u200b\u1796\u17d2\u179a\u17b9\u1780",
               "",
               "\u1793\u17c5\u1796\u17c1\u179b\u179a\u179f\u17c0\u179b",
               "",
               "\u1793\u17c5\u1796\u17c1\u179b\u200b\u179b\u17d2\u1784\u17b6\u1785",
               "",
               "\u1793\u17c5\u1796\u17c1\u179b\u200b\u1799\u1794\u17cb",
               "",
            };
        final String[] metaValue_Eras = new String[] {
               "\u1798\u17bb\u1793 \u1782.\u179f.",
               "\u1782.\u179f.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "h:mm:ss a zzzz",
               "h:mm:ss a z",
               "h:mm:ss a",
               "h:mm a",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE d MMMM y G",
               "d MMMM y G",
               "d MMM y G",
               "d/M/y GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE d MMMM y GGGG",
               "d MMMM y GGGG",
               "d MMM y GGGG",
               "d/M/y G",
            };
        final String metaValue_calendarname_gregorian = "\u1794\u17d2\u179a\u178f\u17b7\u1791\u17b7\u1793\u200b\u17a0\u17d2\u179f\u1780\u17a0\u17d2\u179f\u17ca\u17b8";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u1786\u17d2\u1793\u17b6\u17c6" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.gmtFormat", "\u1798\u17c9\u17c4\u1784\u200b\u179f\u1780\u179b {0}" },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.regionFormat.standard", "\u1798\u17c9\u17c4\u1784\u200b\u179f\u17d2\u178f\u1784\u17cb\u178a\u17b6\u179a\u200b\u1793\u17c5 \u200b{0}" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "\u1794\u17d2\u179a\u178f\u17b7\u1791\u17b7\u1793\u200b\u1787\u1794\u17c9\u17bb\u1793" },
            { "timezone.gmtZeroFormat", "\u1798\u17c9\u17c4\u1784\u200b\u179f\u1780\u179b" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "long.Eras",
                new String[] {
                    "\u1798\u17bb\u1793\u200b\u1782\u17d2\u179a\u17b7\u179f\u17d2\u178f\u179f\u1780\u179a\u17b6\u1787",
                    "\u1782\u17d2\u179a\u17b7\u179f\u17d2\u178f\u179f\u1780\u179a\u17b6\u1787",
                }
            },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1} \u1793\u17c5\u200b\u1798\u17c9\u17c4\u1784 {0}",
                    "{1} \u1793\u17c5\u200b\u1798\u17c9\u17c4\u1784 {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
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
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u1793\u17b6\u1791\u17b8" },
            { "field.era", "\u179f\u1780\u179a\u17b6\u1787" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "\u1796\u17d2\u179a\u17b9\u1780/\u179b\u17d2\u1784\u17b6\u1785" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "calendarname.roc", "\u1794\u17d2\u179a\u178f\u17b7\u1791\u17b7\u1793\u1798\u17b8\u1784\u1782\u17d0\u179a" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterNames },
            { "field.month", "\u1781\u17c2" },
            { "field.second", "\u179c\u17b7\u1793\u17b6\u1791\u17b8" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "\u1794\u17d2\u179a\u178f\u17b7\u1791\u17b7\u1793\u17a2\u17ca\u17b8\u179f\u17d2\u179b\u17b6\u1798" },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:21:00-24:00;afternoon1:12:00-18:00;morning1:00:00-12:00;evening1:18:00-21:00" },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "timezone.regionFormat", "\u1798\u17c9\u17c4\u1784\u200b\u1793\u17c5\u200b {0}" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0' '\u1796\u17b6\u1793\u17cb}",
                    "{other:00' '\u1796\u17b6\u1793\u17cb}",
                    "{other:000\u1796\u17b6\u1793\u17cb}",
                    "{other:0' '\u179b\u17b6\u1793}",
                    "{other:00' '\u179b\u17b6\u1793}",
                    "{other:000' '\u179b\u17b6\u1793}",
                    "{other:0' '\u1794\u17ca\u17b8\u179b\u17b6\u1793}",
                    "{other:00' '\u1794\u17ca\u17b8\u179b\u17b6\u1793}",
                    "{other:000' '\u1794\u17ca\u17b8\u179b\u17b6\u1793}",
                    "{other:0' '\u1791\u17d2\u179a\u17b8\u179b\u17b6\u1793}",
                    "{other:00' '\u1791\u17d2\u179a\u17b8\u179b\u17b6\u1793}",
                    "{other:000' '\u1791\u17d2\u179a\u17b8\u179b\u17b6\u1793}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "field.zone", "\u179b\u17d2\u179c\u17c2\u1784\u1798\u17c9\u17c4\u1784" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterNames },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "\u1790\u17d2\u1784\u17c3\u200b\u1793\u17c3\u200b\u179f\u1794\u17d2\u178a\u17b6\u17a0\u17cd" },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterNames },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "field.week", "\u179f\u1794\u17d2\u178a\u17b6\u17a0\u17cd" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0\u1796\u17b6\u1793\u17cb}",
                    "{other:00\u00a0\u1796\u17b6\u1793\u17cb}",
                    "{other:000\u00a0\u1796\u17b6\u1793\u17cb}",
                    "{other:0\u00a0\u179b\u17b6\u1793}",
                    "{other:00\u00a0\u179b\u17b6\u1793}",
                    "{other:000\u00a0\u179b\u17b6\u1793}",
                    "{other:0\u00a0\u1794\u17ca\u17b8\u179b\u17b6\u1793}",
                    "{other:00\u00a0\u1794\u17ca\u17b8\u179b\u17b6\u1793}",
                    "{other:000\u00a0\u1794\u17ca\u17b8\u179b\u17b6\u1793}",
                    "{other:0\u00a0\u1791\u17d2\u179a\u17b8\u179b\u17b6\u1793}",
                    "{other:00\u00a0\u1791\u17d2\u179a\u17b8\u179b\u17b6\u1793}",
                    "{other:000\u00a0\u1791\u17d2\u179a\u17b8\u179b\u17b6\u1793}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "timezone.regionFormat.daylight", "\u1798\u17c9\u17c4\u1784\u200b\u1796\u17c1\u179b\u200b\u1790\u17d2\u1784\u17c3\u200b\u1793\u17c5\u200b {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.DayNames",
                new String[] {
                    "\u17a2\u17b6\u1791\u17b7\u178f\u17d2\u1799",
                    "\u1785\u1793\u17d2\u1791",
                    "\u17a2\u1784\u17d2\u1782\u17b6\u179a",
                    "\u1796\u17bb\u1792",
                    "\u1796\u17d2\u179a\u17a0\u179f\u17d2\u1794\u178f\u17b7\u17cd",
                    "\u179f\u17bb\u1780\u17d2\u179a",
                    "\u179f\u17c5\u179a\u17cd",
                }
            },
            { "field.hour", "\u1798\u17c9\u17c4\u1784" },
            { "calendarname.buddhist", "\u1794\u17d2\u179a\u178f\u17b7\u1791\u17b7\u1793\u1796\u17bb\u1791\u17d2\u1792\u179f\u17b6\u179f\u1793\u17b6" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a4",
                    "#,##0%",
                    "#,##0.00\u00a4;(#,##0.00\u00a4)",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
