
// line 1 "TickerQuery.ragel"
// Generated using:
// ragel -J -o src/com/appspot/btcticker/utils/TickerQuery.java TickerQuery.ragel
//
package com.appspot.btcticker.fsm;

import com.appspot.btcticker.enums.Currency;

public class PathQuery {

	public Currency from = Currency.BITCOIN;
	public Currency to   = Currency.DOLLAR;
	public double amount = -9;


// line 16 "src/com/appspot/btcticker/utils/TickerQuery.java"
private static byte[] init__query_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,    5,    1,
	    9,    2,    0,    1,    2,    9,    6,    2,    9,    7,    2,    9,
	    8
	};
}

private static final byte _query_actions[] = init__query_actions_0();


private static byte[] init__query_key_offsets_0()
{
	return new byte [] {
	    0,    0,    1,    3,    5,    6,    7,   10,   11,   12,   13,   14,
	   15,   16,   17,   18,   19,   20,   21,   22,   23,   24,   25,   32,
	   38,   39,   39
	};
}

private static final byte _query_key_offsets[] = init__query_key_offsets_0();


private static char[] init__query_trans_keys_0()
{
	return new char [] {
	   47,   48,   57,   48,   57,  116,   99,  101,  103,  117,  117,  114,
	   98,  112,  115,  100,  117,  114,   98,  116,   99,   98,  112,  115,
	  100,   46,   98,  101,  103,  117,   48,   57,   98,  101,  103,  117,
	   48,   57,   50,   50,    0
	};
}

private static final char _query_trans_keys[] = init__query_trans_keys_0();


private static byte[] init__query_single_lengths_0()
{
	return new byte [] {
	    0,    1,    0,    0,    1,    1,    3,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    5,    4,
	    1,    0,    1
	};
}

private static final byte _query_single_lengths[] = init__query_single_lengths_0();


private static byte[] init__query_range_lengths_0()
{
	return new byte [] {
	    0,    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    1,    1,
	    0,    0,    0
	};
}

private static final byte _query_range_lengths[] = init__query_range_lengths_0();


private static byte[] init__query_index_offsets_0()
{
	return new byte [] {
	    0,    0,    2,    4,    6,    8,   10,   14,   16,   18,   20,   22,
	   24,   26,   28,   30,   32,   34,   36,   38,   40,   42,   44,   51,
	   57,   59,   60
	};
}

private static final byte _query_index_offsets[] = init__query_index_offsets_0();


private static byte[] init__query_indicies_0()
{
	return new byte [] {
	    0,    1,    2,    1,    3,    1,    4,    1,    5,    1,    6,    7,
	    8,    1,    9,    1,   10,    1,   11,    1,   10,    1,   12,    1,
	   10,    1,   13,    1,   14,    1,   15,    1,   16,    1,   10,    1,
	   17,    1,   14,    1,   18,    1,   14,    1,   19,   21,   22,   23,
	   24,   20,    1,   21,   22,   23,   24,    3,    1,   25,    1,    1,
	   26,    1,    0
	};
}

private static final byte _query_indicies[] = init__query_indicies_0();


private static byte[] init__query_trans_targs_0()
{
	return new byte [] {
	    2,    0,   22,   23,    5,   24,    7,    9,   11,    8,   25,   10,
	   12,   14,   26,   16,   17,   19,   21,    3,   22,    4,   13,   18,
	   20,    6,   15
	};
}

private static final byte _query_trans_targs[] = init__query_trans_targs_0();


private static byte[] init__query_trans_actions_0()
{
	return new byte [] {
	    0,    0,   13,    3,    0,    0,    7,    9,    5,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    1,   11,   19,   22,
	   16,    0,    0
	};
}

private static final byte _query_trans_actions[] = init__query_trans_actions_0();


private static byte[] init__query_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,   11,   11,
	    0,    0,    0
	};
}

private static final byte _query_eof_actions[] = init__query_eof_actions_0();


static final int query_start = 1;
static final int query_first_final = 22;
static final int query_error = 0;

static final int query_en_main = 1;


// line 45 "TickerQuery.ragel"


	public boolean parse(String urlPart) {
		char[] data = urlPart.toCharArray();
		
		// Used by Ragel
        int cs;
        int p = 0;
        int pe = data.length;
        int eof = data.length;
        
        // Used to store extracted data
        final int zero = (int) '0';
        int i = 0;
        double f = 0.0;
        double scale = 1.0;
		
		// reset state
		from = Currency.BITCOIN;
		to   = Currency.DOLLAR;
		amount = -1;
		
		
// line 172 "src/com/appspot/btcticker/utils/TickerQuery.java"
	{
	cs = query_start;
	}

// line 68 "TickerQuery.ragel"
		
// line 179 "src/com/appspot/btcticker/utils/TickerQuery.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _query_key_offsets[cs];
	_trans = _query_index_offsets[cs];
	_klen = _query_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _query_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _query_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _query_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _query_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _query_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _query_indicies[_trans];
	cs = _query_trans_targs[_trans];

	if ( _query_trans_actions[_trans] != 0 ) {
		_acts = _query_trans_actions[_trans];
		_nacts = (int) _query_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _query_actions[_acts++] )
			{
	case 0:
// line 16 "TickerQuery.ragel"
	{ i = 0; f = 0.0; scale = 1.0; }
	break;
	case 1:
// line 17 "TickerQuery.ragel"
	{ i = i * 10 + (int)data[p] - zero; }
	break;
	case 2:
// line 18 "TickerQuery.ragel"
	{ scale = scale * 0.1; f = f + scale * ((int)data[p] - zero); }
	break;
	case 3:
// line 25 "TickerQuery.ragel"
	{ }
	break;
	case 4:
// line 26 "TickerQuery.ragel"
	{ to = Currency.EURO; }
	break;
	case 5:
// line 27 "TickerQuery.ragel"
	{ to = Currency.POUND; }
	break;
	case 6:
// line 32 "TickerQuery.ragel"
	{ from = Currency.DOLLAR; to = Currency.BITCOIN; }
	break;
	case 7:
// line 35 "TickerQuery.ragel"
	{ from = Currency.EURO; to = Currency.BITCOIN; }
	break;
	case 8:
// line 38 "TickerQuery.ragel"
	{ from = Currency.POUND; to = Currency.BITCOIN; }
	break;
	case 9:
// line 42 "TickerQuery.ragel"
	{ amount = i + f; }
	break;
// line 299 "src/com/appspot/btcticker/utils/TickerQuery.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _query_eof_actions[cs];
	int __nacts = (int) _query_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _query_actions[__acts++] ) {
	case 9:
// line 42 "TickerQuery.ragel"
	{ amount = i + f; }
	break;
// line 324 "src/com/appspot/btcticker/utils/TickerQuery.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 69 "TickerQuery.ragel"
		
		if (cs < query_first_final) {
			return false;
		}
		
		return true;
	}
}